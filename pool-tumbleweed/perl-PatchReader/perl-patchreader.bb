SUMMARY = "Utilities to read and manipulate patches and CVS"
DESCRIPTION = "This perl library allows you to manipulate patches programmatically by chaining \
together a variety of objects that read, manipulate, and output patch \
information."
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "0.9.6"

RPM_NAME = "perl-PatchReader-0.9.6-1.21.noarch.rpm"
RPM_HASH = "7153bb9fb24068ad30d5d5a251f4f122ebb4d5f3ab82cbf1626e72979ba34b8ab949a61d368a482b36d3914438e98bffd85b600f1b7b2a88cfc1f15eb4c8d80a"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Cwd \
perl-File--Temp"

inherit rpm
