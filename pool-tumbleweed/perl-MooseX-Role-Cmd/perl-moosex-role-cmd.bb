SUMMARY = "Wrap system command binaries the Moose way"
DESCRIPTION = "MooseX::Role::Cmd is a Moose role intended to ease the task of building \
command-line wrapper modules. It automatically maps Moose objects into \
command strings which are passed to IPC::Cmd."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-MooseX-Role-Cmd-0.10-12.17.noarch.rpm"
RPM_HASH = "8aadbff57ba01eaceb9a2b2c9e106587c9f18444a0dfc75f23b3dbfc63ef0afb3bb7df098f4644983970af5d2dc186ef4d9cdad0151285a6897ecd6fa06a7f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Role--Cmd \
perl-MooseX--Role--Cmd--Meta--Attribute--Trait \
perl-MooseX-Role-Cmd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-IPC--Cmd \
perl-Moose"

inherit rpm
