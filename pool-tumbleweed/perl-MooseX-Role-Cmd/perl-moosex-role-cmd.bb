SUMMARY = "Wrap system command binaries the Moose way"
DESCRIPTION = "MooseX::Role::Cmd is a Moose role intended to ease the task of building \
command-line wrapper modules. It automatically maps Moose objects into \
command strings which are passed to IPC::Cmd."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-MooseX-Role-Cmd-0.10-12.18.noarch.rpm"
RPM_HASH = "c407f5a993ea4d3957bda5ec47eb5f99ed2e93ce569b626ab6f674c45da2ffb3daa26496491971b19463176a0720b943489e47ff0975dba02d20443f792eb7fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Role--Cmd \
perl-MooseX--Role--Cmd--Meta--Attribute--Trait \
perl-MooseX-Role-Cmd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IPC--Cmd \
perl-Moose"

inherit rpm
