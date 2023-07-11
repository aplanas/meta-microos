SUMMARY = "Tox plugin to workaround no internet connection"
DESCRIPTION = "Workarounds for using tox with no internet connection."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python311-tox-no-internet-0.1.0-1.15.noarch.rpm"
RPM_HASH = "30c81b0e3bc8da3720f6a71ba609d789a9eafc8b1622be95b3e23e0c72883a456061b268c0dbfeccb368412bd75d41f3e917cbc15d4badd5e2db7ccab7c71fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tox-no-internet \
python3.11dist-tox-no-internet \
python311-tox-no-internet \
python3dist-tox-no-internet"

RDEPENDS:${PN} += "python-abi \
python311-tox"

inherit rpm
