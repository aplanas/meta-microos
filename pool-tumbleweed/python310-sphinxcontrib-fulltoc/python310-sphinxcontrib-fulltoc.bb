SUMMARY = "Include a full table of contents in your Sphinx HTML sidebar"
DESCRIPTION = "sphinxcontrib-fulltoc is an extension for the Sphinx_ documentation \
system that changes the HTML output to include a more detailed table \
of contents in the sidebar. By default Sphinx only shows the local \
headers for the current page. With the extension installed, all of the \
page titles are included, and the local headers for the current page \
are also included in the appropriate place within the document."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-sphinxcontrib-fulltoc-1.2.0-2.6.noarch.rpm"
RPM_HASH = "69de4b9dba32e5bdd9b64aec99369479dbdb80e78cebcdb02a29c70a1f84e2939d70b7387ef7af2df222d5348f72cc79a4f4c0899b8ddf02419c54395d51354a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-fulltoc \
python3.10dist(sphinxcontrib-fulltoc) \
python310-sphinxcontrib-fulltoc \
python3dist(sphinxcontrib-fulltoc)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
