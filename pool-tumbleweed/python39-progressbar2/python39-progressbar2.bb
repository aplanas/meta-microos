SUMMARY = "Python library to provide visual text-based progress to long running operations"
DESCRIPTION = "A Python Progressbar library to provide visual (yet text based) progress to long running operations."
LICENSE = "BSD-3-Clause"

PV = "4.2.0"

RPM_NAME = "python39-progressbar2-4.2.0-2.2.noarch.rpm"
RPM_HASH = "e716665ead452092500869de2badb158ec502520113a2f35692e3848bac3783ace2ff576d7731f887a938806d9e23f821b039e898d480746af28d5bcc26f9196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-progressbar2 \
python39-progressbar2 \
python3dist-progressbar2"

RDEPENDS:${PN} += "python-abi \
python39-python-utils"

inherit rpm
