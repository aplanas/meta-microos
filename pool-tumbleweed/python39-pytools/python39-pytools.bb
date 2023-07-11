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

RPM_NAME = "python39-pytools-2022.1.14-1.4.noarch.rpm"
RPM_HASH = "4e2f26c258cb777d7418ee08c35a05a65a0ad6be17835c720f2c1e499450b44d66150078b3b971d3ded75466f792896a0a3183f1ecfbd91c8b3ccefd3114ad18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytools \
python39-pytools \
python3dist-pytools"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-platformdirs \
python39-typing-extensions"

inherit rpm
