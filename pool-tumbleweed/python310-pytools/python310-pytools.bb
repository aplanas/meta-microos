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

RPM_NAME = "python310-pytools-2022.1.14-1.2.noarch.rpm"
RPM_HASH = "0b9b527e1a38499c02822cd5b91341533edd19643995133db33a5f805e347761f3fa18f107bc5caedd026663c2a2f217e0d3b805dee69367a4fa258eecc6d1da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytools \
python3.10dist-pytools \
python310-pytools \
python3dist-pytools"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-platformdirs \
python310-typing-extensions"

inherit rpm
