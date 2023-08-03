SUMMARY = "Indent a LaTeX document, highlighting the programming structure"
DESCRIPTION = "The Perl script processes a LaTeX file, indenting parts so as \
to highlight the structure for the reader. Included are also \
binary (executable) files for Windows, Ubuntu Linux, and macOS."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.20.3svn65937"

RPM_NAME = "texlive-latexindent-2023.209.3.20.3svn65937-55.1.noarch.rpm"
RPM_HASH = "2b99fbbfa3ab607c8313dbccb6b850a9f2440c24f3cdfd149412ec870ab561d91b2f9bf8da29b387d0c2435fabeb420667cb602d3047b0fc48ae16c46224e657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-LatexIndent--AlignmentAtAmpersand \
perl-LatexIndent--Arguments \
perl-LatexIndent--BackUpFileProcedure \
perl-LatexIndent--BlankLines \
perl-LatexIndent--Braces \
perl-LatexIndent--Check \
perl-LatexIndent--Command \
perl-LatexIndent--Document \
perl-LatexIndent--DoubleBackSlash \
perl-LatexIndent--Else \
perl-LatexIndent--Environment \
perl-LatexIndent--FileContents \
perl-LatexIndent--FileExtension \
perl-LatexIndent--GetYamlSettings \
perl-LatexIndent--Heading \
perl-LatexIndent--HiddenChildren \
perl-LatexIndent--HorizontalWhiteSpace \
perl-LatexIndent--IfElseFi \
perl-LatexIndent--Indent \
perl-LatexIndent--Item \
perl-LatexIndent--KeyEqualsValuesBraces \
perl-LatexIndent--Lines \
perl-LatexIndent--LogFile \
perl-LatexIndent--Logger \
perl-LatexIndent--MandatoryArgument \
perl-LatexIndent--ModifyLineBreaks \
perl-LatexIndent--NamedGroupingBracesBrackets \
perl-LatexIndent--OptionalArgument \
perl-LatexIndent--Preamble \
perl-LatexIndent--Replacement \
perl-LatexIndent--RoundBrackets \
perl-LatexIndent--Sentence \
perl-LatexIndent--Special \
perl-LatexIndent--Switches \
perl-LatexIndent--Tokens \
perl-LatexIndent--TrailingComments \
perl-LatexIndent--UnNamedGroupingBracesBrackets \
perl-LatexIndent--Verbatim \
perl-LatexIndent--Version \
perl-LatexIndent--Wrap \
texlive-latexindent"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-Data--Dumper \
perl-Encode \
perl-Exporter \
perl-File--Basename \
perl-File--Copy \
perl-File--HomeDir \
perl-FindBin \
perl-Getopt--Long \
perl-List--Util \
perl-PerlIO--encoding \
perl-Text--Tabs \
perl-Text--Wrap \
perl-YAML--Tiny \
perl-lib \
perl-open \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latexindent-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
