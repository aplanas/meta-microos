SUMMARY = "Include a full table of contents in your Sphinx HTML sidebar"
DESCRIPTION = "sphinxcontrib-fulltoc is an extension for the Sphinx_ documentation \
system that changes the HTML output to include a more detailed table \
of contents in the sidebar. By default Sphinx only shows the local \
headers for the current page. With the extension installed, all of the \
page titles are included, and the local headers for the current page \
are also included in the appropriate place within the document."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python39-sphinxcontrib-fulltoc-1.2.0-2.8.noarch.rpm"
RPM_HASH = "dd3cd0f4496ef65dbf7cb96964f5a5b67c0193452cd5f33404b5517b94be74ddfff51b04f2931b20992fed9501f5950cefb9f400101a2abdc8d907c6709a364d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-fulltoc \
python39-sphinxcontrib-fulltoc \
python3dist-sphinxcontrib-fulltoc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
