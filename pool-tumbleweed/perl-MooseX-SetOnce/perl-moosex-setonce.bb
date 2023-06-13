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

RPM_NAME = "perl-MooseX-SetOnce-0.203-1.2.noarch.rpm"
RPM_HASH = "690dc2734b2ef35a23ad1cc07a7754666fa828b94e54de741a872504fb04dde69fad91868b44a18f3349cf4fdf31fb0b7ee197900a763eb5180d650b6c54aaf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Moose::Meta::Attribute::Custom::Trait::SetOnce) \
perl(MooseX::SetOnce) \
perl(MooseX::SetOnce::Accessor) \
perl(MooseX::SetOnce::Attribute) \
perl-MooseX-SetOnce"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose::Role)"

inherit rpm
