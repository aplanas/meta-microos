SUMMARY = "An expandable key=val implementation and friends"
DESCRIPTION = "This is a collection of different packages that provide \
key=value functionality in plainTeX, LaTeX, and ConTeXt. At the \
core, the expkv package implements two expandable key=value \
parsers that are somewhat fast and robust against common bugs \
in many key=value implementations (no accidental brace \
stripping, no fragility for active commas or equals signs). \
expkv-cs enables users to define expandable key=value macros in \
a comfortable and straightforward way. expkv-def provides an \
interface to define common key types for expkv similar to the \
key defining interfaces of widespread key=value \
implementations. expkv-opt allows to parse package or class \
options in LaTeX via expkv. expkv-pop is a utility package to \
define prefix oriented parsers that allow a somewhat natural \
formulation (it provides the core functionality for the \
key-defining front ends of both expkv-cs and expkv-def)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65623"

RPM_NAME = "texlive-expkv-bundle-2023.209.svn65623-53.1.noarch.rpm"
RPM_HASH = "9afec05a2f1e2d46fbcde8ac2c8de52a3ef87a30b88e8214c3b649a186beaee11ccabd3c2cd76bcc61836dc967ba73cd8c343b2a4c7e686f6f7e9ed485601398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-expkv-cs.sty \
tex-expkv-cs.tex \
tex-expkv-def.sty \
tex-expkv-def.tex \
tex-expkv-opt-2020-10-10.sty \
tex-expkv-opt.sty \
tex-expkv-pop.sty \
tex-expkv-pop.tex \
tex-expkv.sty \
tex-expkv.tex \
tex-t-expkv-cs.tex \
tex-t-expkv-def.tex \
tex-t-expkv-pop.tex \
tex-t-expkv.tex \
texlive-expkv-bundle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
