SUMMARY = "Post transaction actions Plugin for DNF"
DESCRIPTION = "Post transaction actions Plugin for DNF, Python 3 version. Plugin runs actions \
(shell commands) after transaction is completed. Actions are defined in action \
files."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-post-transaction-actions-4.3.1-2.2.noarch.rpm"
RPM_HASH = "04d48db1ba553169cdb76e3d66f64bdceb3faf9a3b203d7de9d8d346a256b9273fa4251a84636d6eda1dc9dd04c54736ff98406404f12525dd1c02a4f76521d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-post-transaction-actions \
dnf-plugin-post-transaction-actions \
python3-dnf-plugin-post-transaction-actions"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-core"

inherit rpm
