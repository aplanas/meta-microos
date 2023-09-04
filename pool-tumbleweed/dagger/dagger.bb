SUMMARY = "A portable devkit for CI/CD pipelines"
DESCRIPTION = "Dagger is a portable devkit for CICD. \
 \
Using Dagger, software teams can develop powerful CICD pipelines with minimal effort, then run them anywhere. Benefits include: \
* Unify dev and CI environments. Write your pipeline once, Dagger will run it the same everywhere. \
* Reduce CI lock-in. No more re-writing everything from scratch every 6 months."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "dagger-0.8.1-1.1.aarch64.rpm"
RPM_HASH = "656857f9336057402d5c9a9c7796e04715e5761070c0c350331eff2104676b9fe589c5a0136b75b5d074bf547266ad505f69c888fa23367a9c7409059eaa0dc3"

RPROVIDES:${PN} += "dagger"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
