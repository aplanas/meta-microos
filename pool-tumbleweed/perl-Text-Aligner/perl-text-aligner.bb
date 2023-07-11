SUMMARY = "Module to align text"
DESCRIPTION = "Text::Aligner exports a single function, align(), which is used to justify \
strings to various alignment styles. The alignment specification is the \
first argument, followed by any number of scalars which are subject to \
alignment. \
 \
The operation depends on context. In list context, a list of the justified \
scalars is returned. In scalar context, the justified arguments are joined \
into a single string with newlines appended. The original arguments remain \
unchanged. In void context, in-place justification is attempted. In this \
case, all arguments must be lvalues. \
 \
Align() also does one level of scalar dereferencing. That is, whenever one \
of the arguments is a scalar reference, the scalar pointed to is aligned \
instead. Other references are simply stringified. An undefined argument is \
interpreted as an empty string without complaint. \
 \
Alignment respects colorizing escape sequences a la Term::ANSIColor which \
means it knows that these sequences don't take up space on the screen."
LICENSE = "SUSE-Public-Domain"

PV = "0.16"

RPM_NAME = "perl-Text-Aligner-0.16-1.14.noarch.rpm"
RPM_HASH = "51e0106c4cdc0698291f8be36cb6986f68192fc81702a44d651df034de1a825bde94b0e5de32fb71c5b32c88203c14d3574d1813b10758d0993ed14417a521aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Aligner \
perl-Text--Aligner--Auto \
perl-Text--Aligner--MaxKeeper \
perl-Text-Aligner"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Term--ANSIColor"

inherit rpm
