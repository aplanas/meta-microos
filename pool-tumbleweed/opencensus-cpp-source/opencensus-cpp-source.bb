SUMMARY = "Source code of opencensus-cpp"
DESCRIPTION = "OpenCensus is a toolkit for collecting application performance and behavior \
data. It currently includes an API for tracing and stats. \
 \
This package provides source code of opencensus-cpp."
LICENSE = "Apache-2.0"

PV = "0.4.0+git.20190924"

RPM_NAME = "opencensus-cpp-source-0.4.0+git.20190924-1.10.noarch.rpm"
RPM_HASH = "2fd5cc29de75861e673f291ad1a715ac1ead54cc522f6d099c4e4ae95eaad4db88817e2b6bbadd764433bd2001afe5e4cebb8c1d2947b608f96663b5a2d529fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencensus-cpp-source"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/env"

inherit rpm
