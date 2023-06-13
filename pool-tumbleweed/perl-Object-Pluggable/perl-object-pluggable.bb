SUMMARY = "Base Class for Creating Plugin-Enabled Objects"
DESCRIPTION = "Object::Pluggable is a base class for creating plugin enabled objects. It \
is a generic port of POE::Component::IRC's plugin system. \
 \
If your object dispatches events to listeners, then Object::Pluggable may \
be a good fit for you. \
 \
Basic use would involve subclassing Object::Pluggable, then overriding \
'_pluggable_event()' and inserting '_pluggable_process()' wherever you \
dispatch events from. \
 \
Users of your object can then load plugins using the plugin methods \
provided to handle events generated by the object. \
 \
You may also use plugin style handlers within your object as \
'_pluggable_process()' will attempt to process any events with local method \
calls first. The return value of these handlers has the same significance \
as the return value of 'normal' plugin handlers."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.29"

RPM_NAME = "perl-Object-Pluggable-1.29-1.20.noarch.rpm"
RPM_HASH = "4d911e83fdbdf35190e35a2046ffc254a18028b812e54a1b097e23e88a67761eed90ae7f5c5d82a9271613d434cebdcbd68ccbd84d47f3d396eede6222390f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Object::Pluggable) \
perl(Object::Pluggable::Constants) \
perl(Object::Pluggable::Pipeline) \
perl-Object-Pluggable"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Task::Weaken) \
perl(constant)"

inherit rpm
