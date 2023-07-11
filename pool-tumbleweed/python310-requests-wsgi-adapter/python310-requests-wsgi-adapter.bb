SUMMARY = "WSGI Transport Adapter for Requests"
DESCRIPTION = "WSGI Transport Adapter for Requests"
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python310-requests-wsgi-adapter-0.4.1-2.1.noarch.rpm"
RPM_HASH = "6c88f25722269a3c9cd38799bea3395cb9047c1a8d1972789a55bd556c32e40458d9c1caba4fa521bf86aae9445984f40677a5738bce5d1d67fb56529796cf4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-wsgi-adapter \
python310-requests-wsgi-adapter \
python3dist-requests-wsgi-adapter"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
