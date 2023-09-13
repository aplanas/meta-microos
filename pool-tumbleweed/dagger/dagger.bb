SUMMARY = "A portable devkit for CI/CD pipelines"
DESCRIPTION = "Dagger is a portable devkit for CICD. \
 \
Using Dagger, software teams can develop powerful CICD pipelines with minimal effort, then run them anywhere. Benefits include: \
* Unify dev and CI environments. Write your pipeline once, Dagger will run it the same everywhere. \
* Reduce CI lock-in. No more re-writing everything from scratch every 6 months."
LICENSE = "GPL-3.0-only"

PV = "0.8.4"

RPM_NAME = "dagger-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "454095ac8512516674a890ee801ec4018666190935b8d0fa4160ef74f255d8c83c0b80e763071d3d66c93f6abe5cbc654ee49efe56d846abc7041514547184dc"

RPROVIDES:${PN} += "dagger"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
