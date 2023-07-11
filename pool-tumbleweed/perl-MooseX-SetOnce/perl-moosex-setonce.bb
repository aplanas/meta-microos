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

RPM_NAME = "perl-MooseX-SetOnce-0.203-1.3.noarch.rpm"
RPM_HASH = "bf49bb917d7792e9e2ce79a373af14486dd8fccb741db60dac533a700da2566f9bce86ad451e56ab35a4af87b6b4d93951def57665a176cd6cc878fadc815c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Moose--Meta--Attribute--Custom--Trait--SetOnce \
perl-MooseX--SetOnce \
perl-MooseX--SetOnce--Accessor \
perl-MooseX--SetOnce--Attribute \
perl-MooseX-SetOnce"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose--Role"

inherit rpm
