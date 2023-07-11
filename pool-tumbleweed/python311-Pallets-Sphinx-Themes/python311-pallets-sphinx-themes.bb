SUMMARY = "Themes for the Pallets projects."
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-Pallets-Sphinx-Themes-2.1.0-1.3.noarch.rpm"
RPM_HASH = "4e359c9312130dd5f83bd99f96b142a3622f4bd8ca75033495594b11d8dc5f449f8d023ae47644b70cf3d5a5381866a4e7a4d096d2b3a06f2ccaa2cc5a8c43a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pallets-Sphinx-Themes \
python3.11dist-pallets-sphinx-themes \
python311-Pallets-Sphinx-Themes \
python3dist-pallets-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-packaging"

inherit rpm
