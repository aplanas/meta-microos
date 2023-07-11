SUMMARY = "Themes for the Pallets projects."
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-Pallets-Sphinx-Themes-2.1.0-1.3.noarch.rpm"
RPM_HASH = "01231128a1d591edba8a7ab4274f91ad02bc3535718f570f21540628bbf5f93a236490cac7fbcae2e3ded08cd3606997144bbbf0ef4b763cfff4b69c483830b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pallets-sphinx-themes \
python39-Pallets-Sphinx-Themes \
python3dist-pallets-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-packaging"

inherit rpm
