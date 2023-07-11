SUMMARY = "Include a full table of contents in your Sphinx HTML sidebar"
DESCRIPTION = "sphinxcontrib-fulltoc is an extension for the Sphinx_ documentation \
system that changes the HTML output to include a more detailed table \
of contents in the sidebar. By default Sphinx only shows the local \
headers for the current page. With the extension installed, all of the \
page titles are included, and the local headers for the current page \
are also included in the appropriate place within the document."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-sphinxcontrib-fulltoc-1.2.0-2.8.noarch.rpm"
RPM_HASH = "e5a1c2528021068e10f53fd6d7d30b1effb51370094fa97a47226e4f38f693f9651795398c3de2dbb55a97cd4e2837fbb577b3f0014611ef58ca808d104413ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-fulltoc \
python310-sphinxcontrib-fulltoc \
python3dist-sphinxcontrib-fulltoc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
