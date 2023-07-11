SUMMARY = "web.py: makes web apps"
DESCRIPTION = "Think about the ideal way to write a web app. Write the code to make it happen."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "0.62"

RPM_NAME = "python310-web.py-0.62-3.10.noarch.rpm"
RPM_HASH = "49eaaef94db1d1fafa95d0bb9c3b1bbfc426dcff691fae9cc7d1648855f7a88ccd2a082a6902ae060567a6269601df4c644648ca88621d1c036c41d5b88df654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-web.py \
python310-web.py \
python3dist-web.py"

RDEPENDS:${PN} += "python-abi \
python310-cheroot"

inherit rpm
