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

RPM_NAME = "perl-Text-Aligner-0.16-1.13.noarch.rpm"
RPM_HASH = "3f4de5f7e75c6bee9f51b8b785bce291d3554d2a3925955aa6aadc74bb0858529905acde79a783b244f239f4527818ecdfd7cfe8e13d0fb91c7db04dc0fb1b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Aligner \
perl-Text--Aligner--Auto \
perl-Text--Aligner--MaxKeeper \
perl-Text-Aligner"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Term--ANSIColor"

inherit rpm
