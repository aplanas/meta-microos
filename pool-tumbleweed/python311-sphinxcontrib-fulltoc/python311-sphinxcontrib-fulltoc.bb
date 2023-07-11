SUMMARY = "Include a full table of contents in your Sphinx HTML sidebar"
DESCRIPTION = "sphinxcontrib-fulltoc is an extension for the Sphinx_ documentation \
system that changes the HTML output to include a more detailed table \
of contents in the sidebar. By default Sphinx only shows the local \
headers for the current page. With the extension installed, all of the \
page titles are included, and the local headers for the current page \
are also included in the appropriate place within the document."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python311-sphinxcontrib-fulltoc-1.2.0-2.8.noarch.rpm"
RPM_HASH = "f934277e1a2cce3c3877273c458222150744a3ed1ee99637cf43ea0b221ca37cc0e3ee9d05510bd18a95eedf27591c33a8594e9b4709227116864a72400edd5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-fulltoc \
python3.11dist-sphinxcontrib-fulltoc \
python311-sphinxcontrib-fulltoc \
python3dist-sphinxcontrib-fulltoc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
