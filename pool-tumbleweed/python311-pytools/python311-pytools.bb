SUMMARY = "A collection of tools for Python"
DESCRIPTION = "Pytools is a big bag of things that are 'missing' from the Python standard library. \
This is mainly a dependency of other software packages (pycuda, pyopencl, etc ), \
and is probably of little interest to you unless you use those. If you're curious \
nonetheless, here's what's on offer: \
* A ton of small tool functions such as len_iterable, argmin, tuple generation, \
  permutation generation, ASCII table pretty printing, GvR's mokeypatch_xxx() hack, \
  the elusive flatten, and much more. \
* Michele Simionato's decorator module \
* A time-series logging module, pytools.log. \
* Batch job submission, pytools.batchjob. \
* A lexer, pytools.lex."
LICENSE = "MIT"

PV = "2022.1.14"

RPM_NAME = "python311-pytools-2022.1.14-1.4.noarch.rpm"
RPM_HASH = "4cdc52edfff1bd87fff0a5c701e031e0205f4210eee08567b43e02b27df84f08f2f265feeaa4f4587bd6b043e4732144f8f667635b9801e8d735462cdef247ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytools \
python3.11dist-pytools \
python311-pytools \
python3dist-pytools"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-platformdirs"

inherit rpm
