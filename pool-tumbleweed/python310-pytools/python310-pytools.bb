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

RPM_NAME = "python310-pytools-2022.1.14-1.4.noarch.rpm"
RPM_HASH = "ce0761c107219541f3da7e68c0b66e341257ccd69a0a2ac739a046c1f2f6cbcdb6cfaf2e849b0f536e5b312403e9031010c0fd9ee2ee0c177655016ba1a55b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytools \
python310-pytools \
python3dist-pytools"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-platformdirs \
python310-typing-extensions"

inherit rpm
