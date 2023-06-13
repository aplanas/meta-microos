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

RPM_NAME = "python311-pytools-2022.1.14-1.2.noarch.rpm"
RPM_HASH = "a08ef793a79a6b933fcd952583acc966e10c30df54806c4c90120ef77063e550b3257957d37331869fb9d5f3e0e90e21735d7603324f215b26bc3b5f8e7efba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytools) \
python311-pytools \
python3dist(pytools)"

RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-platformdirs"

inherit rpm
