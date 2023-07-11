SUMMARY = "Uncertainties on the Quantities Involved (aka 'Error Propagation')"
DESCRIPTION = "'uncertainties' allows calculations such as (2±0.1)*2 = 4±0.2 to be \
performed transparently. Much more complex mathematical expressions \
involving numbers with uncertainties can also be evaluated directly."
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "python39-uncertainties-3.1.7-1.6.noarch.rpm"
RPM_HASH = "d23b9badd286907e26cad63ecdd44f27d8350f7e2e54aedc7e1634080b4bed2100085b4e65d0df9c5876811d7070857aacfd3de12dacb2914c9d66ad5030b53e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uncertainties \
python39-uncertainties \
python3dist-uncertainties"

RDEPENDS:${PN} += "python-abi \
python39-future"

inherit rpm
