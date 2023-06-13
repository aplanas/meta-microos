SUMMARY = "Javadoc for plexus-cli"
DESCRIPTION = "Javadoc for plexus-cli."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "plexus-cli-javadoc-1.6-5.4.noarch.rpm"
RPM_HASH = "e05902bc0d475c6a526e12fa170866992b961164d2072e11d1948b2cd42d5a080fd82bb03893d858321b0ff2493d346a921a6f76c39c31bcc076b29dd0ddaf5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-cli-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
