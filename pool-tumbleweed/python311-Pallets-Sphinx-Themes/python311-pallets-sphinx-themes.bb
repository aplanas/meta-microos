SUMMARY = "Themes for the Pallets projects"
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python311-Pallets-Sphinx-Themes-2.1.1-1.1.noarch.rpm"
RPM_HASH = "5dc55662f5c6bc27ff32accff3de98930edcb64ca35d07a8ef5af883c23fc8bbe99e24637370d9255b443215e82d04c88ab82803b557a1a345effe552938b682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pallets-Sphinx-Themes \
python3.11dist-pallets-sphinx-themes \
python311-Pallets-Sphinx-Themes \
python3dist-pallets-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-packaging"

inherit rpm
