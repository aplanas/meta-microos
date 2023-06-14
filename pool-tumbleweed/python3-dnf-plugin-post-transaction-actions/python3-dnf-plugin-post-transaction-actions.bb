SUMMARY = "Post transaction actions Plugin for DNF"
DESCRIPTION = "Post transaction actions Plugin for DNF, Python 3 version. Plugin runs actions \
(shell commands) after transaction is completed. Actions are defined in action \
files."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-post-transaction-actions-4.3.1-2.1.noarch.rpm"
RPM_HASH = "b996696cc82fd55cdbf2a3d973c51c5512c242d7908f8543474a60def75265cf980f49bbb9d5c6adb0dba49cbaf9edb9b9727ec9b05ffcd32c49e36dfe511ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-post-transaction-actions \
dnf-plugin-post-transaction-actions \
python3-dnf-plugin-post-transaction-actions"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-core"

inherit rpm
