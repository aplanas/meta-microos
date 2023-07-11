SUMMARY = "Examples for paexec"
DESCRIPTION = "A program that processes a list of tasks in parallel \
on different CPUs, computers in a network or whatever else. \
 \
This package contains examples for paexec."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "paexec-examples-1.1.4-2.10.noarch.rpm"
RPM_HASH = "3c419caa4b099d012be064ec09df2276d4401b838fa7c5a0f5cb44993fbc9141b3f06ee270ade9fb6fccf1294b585728fe1a692badfaa5fe0382c1533eb118e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paexec-examples"

RDEPENDS:${PN} += "paexec"

inherit rpm
