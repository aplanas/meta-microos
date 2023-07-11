SUMMARY = "CPython's PEG parser generator"
DESCRIPTION = "CPython's PEG parser generator"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-pegen-0.2.0-1.4.noarch.rpm"
RPM_HASH = "0449c1d93047d52adfbb50d24eacd8692d1a7c921c12dc1f800d96b4ba2ff09c1aefe72aba415ba784b1aee7427377af95dacff880e1c240dd5d22805a5261db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pegen \
python310-pegen \
python3dist-pegen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
