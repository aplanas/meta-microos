SUMMARY = "Samples of code written in Brainfuck"
DESCRIPTION = "Some examples of programs written in Brainfuck."
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "bff-samples-1.0.7-1.2.noarch.rpm"
RPM_HASH = "eef8aa371eca172dc37d4054e43f345aa638f3e0ff3f56844b9f8f4e76486485aa743d30b0c8b6d8895d92a8f374ea6e069417bae730d6b3d9d5eed7b5324a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bff-samples"
RDEPENDS:${PN} += ""

inherit rpm
