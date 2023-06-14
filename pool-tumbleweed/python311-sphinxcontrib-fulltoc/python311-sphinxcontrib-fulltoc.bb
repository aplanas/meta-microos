SUMMARY = "Include a full table of contents in your Sphinx HTML sidebar"
DESCRIPTION = "sphinxcontrib-fulltoc is an extension for the Sphinx_ documentation \
system that changes the HTML output to include a more detailed table \
of contents in the sidebar. By default Sphinx only shows the local \
headers for the current page. With the extension installed, all of the \
page titles are included, and the local headers for the current page \
are also included in the appropriate place within the document."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python311-sphinxcontrib-fulltoc-1.2.0-2.6.noarch.rpm"
RPM_HASH = "5a26bae486bcea6a72e797b6e2251992bba8a86c0b106c073736da0b65fe8cdeda8dc45d4f6cef68edbb7572ab50a3829ad220f74b2628a1c4cf063e6bada2b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinxcontrib-fulltoc \
python311-sphinxcontrib-fulltoc \
python3dist-sphinxcontrib-fulltoc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
