SUMMARY = "Native Language Support (NLS) for C#"
DESCRIPTION = "Mono with its 'resgen' program uses a design that Microsoft created and \
that gives the power to the software vendor and not to the user: it \
doesn't allow the end-user to create his own localisations for existing \
programs. As documented in the gettext manual: \
 \
The advantages of the .dll' format over the .resources' format are: \
 \
1. 1. Freedom to localize: Users can add their own translations to an \
   application after it has been built and distributed.  Whereas \
   when the programmer uses a ResourceManager' constructor provided \
   by the system, the set of .resources' files for an application \
   must be specified when the application is built and cannot be \
   extended afterwards. \
 \
2., 3., 4. ... \
 \
The included GNU.Gettext.dll gives the user this freedom back and the \
also included msgfmt.net.exe and msgunfmt.net.exe handle PO files more \
reliably than 'resgen'."
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.1"

RPM_NAME = "gettext-csharp-0.21.1-2.1.aarch64.rpm"
RPM_HASH = "340d82fb7a16b4a259a93319645246dd74960841529b44b7013b8d0c73b8b0e2cf6b76c783a31f3865b10a0dfc1b796988b49d738172b07eab8b3a4233648f67"

RPROVIDES:${PN} += "gettext-csharp \
gettext-csharp(aarch-64) \
mono(GNU.Gettext) \
mono(msgfmt.net) \
mono(msgunfmt.net)"

RDEPENDS:${PN} += "mono \
mono(mscorlib)"

inherit rpm
