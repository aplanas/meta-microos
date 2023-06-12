SUMMARY = "Include a full table of contents in your Sphinx HTML sidebar"
DESCRIPTION = "sphinxcontrib-fulltoc is an extension for the Sphinx_ documentation \
system that changes the HTML output to include a more detailed table \
of contents in the sidebar. By default Sphinx only shows the local \
headers for the current page. With the extension installed, all of the \
page titles are included, and the local headers for the current page \
are also included in the appropriate place within the document."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python39-sphinxcontrib-fulltoc-1.2.0-2.6.noarch.rpm"
RPM_HASH = "ec2adcc9a2410daf5915b9f395e5a505ec62c6d58c34ce473d984936f3eba3f93468ad7f9cf20f05bafc92bbd56155a5121dd720023155cb6f1243fd1d45e449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-fulltoc) \
python39-sphinxcontrib-fulltoc \
python3dist(sphinxcontrib-fulltoc)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
