SUMMARY = "A portable devkit for CI/CD pipelines"
DESCRIPTION = "Dagger is a portable devkit for CICD. \
 \
Using Dagger, software teams can develop powerful CICD pipelines with minimal effort, then run them anywhere. Benefits include: \
* Unify dev and CI environments. Write your pipeline once, Dagger will run it the same everywhere. \
* Reduce CI lock-in. No more re-writing everything from scratch every 6 months."
LICENSE = "GPL-3.0-only"

PV = "0.6.4"

RPM_NAME = "dagger-0.6.4-1.1.aarch64.rpm"
RPM_HASH = "2c151c9f8b6f2c4dba885cd504f0310091da75493ffbe5c8ca8418028b720e11d2e103db22e3f98adb28154ab43ed221b35aa261620bd142a4b199e73cdd6807"

RPROVIDES:${PN} += "dagger"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
