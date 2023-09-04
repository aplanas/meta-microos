SUMMARY = "Write-once, read-many attributes for Moose"
DESCRIPTION = "The 'SetOnce' attribute lets your class have attributes that are not lazy \
and not set, but that cannot be altered once set. \
 \
The logic is very simple: if you try to alter the value of an attribute \
with the SetOnce trait, either by accessor or writer, and the attribute has \
a value, it will throw an exception. \
 \
If the attribute has a clearer, you may clear the attribute and set it \
again."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.203"

RPM_NAME = "perl-MooseX-SetOnce-0.203-1.4.noarch.rpm"
RPM_HASH = "bf538a232a2973c4275a1fbf04252959c3eb9b0c5b75a151b87de63db1d784fb9686ade1bd6e6e7d7b7a8c5b4f9659a72ae1060e2bde5e0c61d86102cd4078c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Moose--Meta--Attribute--Custom--Trait--SetOnce \
perl-MooseX--SetOnce \
perl-MooseX--SetOnce--Accessor \
perl-MooseX--SetOnce--Attribute \
perl-MooseX-SetOnce"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose--Role"

inherit rpm
