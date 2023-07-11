SUMMARY = "Automate generation of man pages for python click applications"
DESCRIPTION = "Automate generation of man pages for Python Click applications."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-click-man-0.4.1-1.17.noarch.rpm"
RPM_HASH = "ee5c9a6b74194dff0187cdd342e54de7ab8f46397f040648d9823ae5fce808077076bc975863735db1ba23f0465cfff15b9de38a7afd7236ef2a73a650c41f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-man \
python39-click-man \
python3dist-click-man"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click"

inherit rpm
