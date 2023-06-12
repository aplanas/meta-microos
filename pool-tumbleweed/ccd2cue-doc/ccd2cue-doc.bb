SUMMARY = "Documentation for ccd2cue and the CCD and CUE sheet formats"
DESCRIPTION = "GNU ccd2cue is a CCD sheet to CUE sheet converter.  It supports the full \
extent of CUE sheet format expressiveness, including mixed-mode discs \
and CD-Text meta-data. \
 \
This package contains the documentation, including free documentation on \
the CCD and CUE sheet formats."
LICENSE = "GFDL-1.3"

PV = "0.5"

RPM_NAME = "ccd2cue-doc-0.5-2.23.noarch.rpm"
RPM_HASH = "b3d8b0a534566d1d923602da1e0925b16c37cad83d685ff9110800fd57cf6dd1e305ab272f6e36d7f33f53526c0f4bd6e9ccdc6c0bf2f587f2147f9189ab8ef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ccd2cue-doc"
RDEPENDS:${PN} += "/bin/sh \
ccd2cue \
info"

inherit rpm
