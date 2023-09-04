SUMMARY = "Turns ref() into a multimethod"
DESCRIPTION = "This module changes the behavior of the builtin function ref(). If ref() is \
called on an object that has requested an overloaded ref, the object's \
'->ref' method will be called and its return value used instead."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-UNIVERSAL-ref-0.14-1.15.aarch64.rpm"
RPM_HASH = "5ce176159b3a466694828d3a6227de3c9d5cba0ddaaad0a9a0e4037dce3a9ce96d1e14852b3f2a835b37614b8e2af5e94b9551eb7066392ec55deb29091025ab"

RPROVIDES:${PN} += "perl-UNIVERSAL--ref \
perl-UNIVERSAL-ref"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-B--Utils"

inherit rpm
