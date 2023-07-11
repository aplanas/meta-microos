SUMMARY = "Utilities to read and manipulate patches and CVS"
DESCRIPTION = "This perl library allows you to manipulate patches programmatically by chaining \
together a variety of objects that read, manipulate, and output patch \
information."
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "0.9.6"

RPM_NAME = "perl-PatchReader-0.9.6-1.20.noarch.rpm"
RPM_HASH = "ac85beb912d7780f2fc44793e2bdbf14e29a06eb73ee66a918aba884e02fad05e65eba30f26d0564d8c21db821c033decd48689ebce230da84f1c32dd41eae80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PatchReader \
perl-PatchReader--AddCVSContext \
perl-PatchReader--Base \
perl-PatchReader--CVSClient \
perl-PatchReader--DiffPrinter--raw \
perl-PatchReader--DiffPrinter--template \
perl-PatchReader--FilterPatch \
perl-PatchReader--FixPatchRoot \
perl-PatchReader--NarrowPatch \
perl-PatchReader--PatchInfoGrabber \
perl-PatchReader--Raw"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Cwd \
perl-File--Temp"

inherit rpm
