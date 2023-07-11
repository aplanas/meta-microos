SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-stack-data-0.6.2-2.3.noarch.rpm"
RPM_HASH = "20d561b905de1989a0ee5b66336e5c7a2bf67d4d1909a0d8c921dbe401e5af792dc4eedd7ae657570114d188dd2cf9547f8116e423dae968e85741b445a9f26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-stack-data \
python39-stack-data \
python3dist-stack-data"

RDEPENDS:${PN} += "python-abi \
python39-asttokens \
python39-executing \
python39-pure-eval"

inherit rpm
