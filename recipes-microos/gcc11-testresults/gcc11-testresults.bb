SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-testresults-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "cc728c681f5fee974eef3dfe35e32038e909f3b4de7725280449bf9c045366b248c1f548285e4f7027fe87ff939521c25444d9def54cda4075f16ee06b360a55"

RPROVIDES:${PN} += "gcc11-testresults gcc11-testresults(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
