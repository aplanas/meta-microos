SUMMARY = "Wrap system command binaries the Moose way"
DESCRIPTION = "MooseX::Role::Cmd is a Moose role intended to ease the task of building \
command-line wrapper modules. It automatically maps Moose objects into \
command strings which are passed to IPC::Cmd."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-MooseX-Role-Cmd-0.10-12.19.noarch.rpm"
RPM_HASH = "1a268be4ee472c853c8e80a7630a97c48a759c31531c3c4276288c1a42f1a69a3b1fd08cf7207810b9d776e199ad08f529ee040ca287ad25fbe23ee2b996debb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Role--Cmd \
perl-MooseX--Role--Cmd--Meta--Attribute--Trait \
perl-MooseX-Role-Cmd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IPC--Cmd \
perl-Moose"

inherit rpm
