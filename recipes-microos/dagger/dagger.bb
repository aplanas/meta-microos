SUMMARY = "A portable devkit for CI/CD pipelines"
DESCRIPTION = "Dagger is a portable devkit for CICD. \
 \
Using Dagger, software teams can develop powerful CICD pipelines with minimal effort, then run them anywhere. Benefits include: \
* Unify dev and CI environments. Write your pipeline once, Dagger will run it the same everywhere. \
* Reduce CI lock-in. No more re-writing everything from scratch every 6 months."
LICENSE = "GPL-3.0-only"

PV = "0.5.1"

RPM_NAME = "dagger-0.5.1-1.1.aarch64.rpm"
RPM_HASH = "6bb9124f03897253899c8441f89a92e65e1680abf3b0364c1d0bcf0b9ec8c2f88988893cde4bbbb5b97655fb7cb0237bae022637f1c338e01528bf81934e3336"

RPROVIDES:${PN} += "dagger dagger(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
