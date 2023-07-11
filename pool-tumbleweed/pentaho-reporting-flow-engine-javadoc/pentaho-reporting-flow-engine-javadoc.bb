SUMMARY = "Javadoc for pentaho-reporting-flow-engine"
DESCRIPTION = "Javadoc for pentaho-reporting-flow-engine."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "pentaho-reporting-flow-engine-javadoc-0.9.4-6.7.noarch.rpm"
RPM_HASH = "5349ba34daad0d16665d01bd181c6c82e9de487c9a4d97c7ef1d86fd6716838bb9007b56624c41e6519ef3d8aa7df1408b6ac5bb43191241fd2cbbd0a252ec66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-reporting-flow-engine-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
