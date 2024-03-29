SUMMARY = "YAML 1.2 Processor"
DESCRIPTION = "YAML::PP is a modular YAML processor. \
 \
It aims to support 'YAML 1.2' and 'YAML 1.1'. See https://yaml.org/. Some \
(rare) syntax elements are not yet supported and documented below. \
 \
YAML is a serialization language. The YAML input is called 'YAML Stream'. A \
stream consists of one or more 'Documents', separated by a line with a \
document start marker '---'. A document optionally ends with the document \
end marker '...'. \
 \
This allows one to process continuous streams additionally to a fixed input \
file or string. \
 \
The YAML::PP frontend will currently load all documents, and return only \
the first if called with scalar context. \
 \
The YAML backend is implemented in a modular way that allows one to add \
custom handling of YAML tags, perl objects and data types. The inner API is \
not yet stable. Suggestions welcome. \
 \
You can check out all current parse and load results from the \
yaml-test-suite here: https://perlpunk.github.io/YAML-PP-p5/test-suite.html"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.036"

RPM_NAME = "perl-YAML-PP-0.036-1.3.noarch.rpm"
RPM_HASH = "f9ceb3c4efbd64bcdb9903069a8ed57cbab5cb204b287ab6179a59c756929fcb5a5937a263866df7e417f08fb6b003230b598d404b0bddc8e717fdb2fa990e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML--PP \
perl-YAML--PP--Common \
perl-YAML--PP--Constructor \
perl-YAML--PP--Dumper \
perl-YAML--PP--Emitter \
perl-YAML--PP--Exception \
perl-YAML--PP--Grammar \
perl-YAML--PP--Highlight \
perl-YAML--PP--Lexer \
perl-YAML--PP--Loader \
perl-YAML--PP--Parser \
perl-YAML--PP--Perl \
perl-YAML--PP--Preserve--Array \
perl-YAML--PP--Preserve--Hash \
perl-YAML--PP--Preserve--Scalar \
perl-YAML--PP--Reader \
perl-YAML--PP--Reader--File \
perl-YAML--PP--Render \
perl-YAML--PP--Representer \
perl-YAML--PP--Schema \
perl-YAML--PP--Schema--Binary \
perl-YAML--PP--Schema--Core \
perl-YAML--PP--Schema--Failsafe \
perl-YAML--PP--Schema--Include \
perl-YAML--PP--Schema--JSON \
perl-YAML--PP--Schema--Merge \
perl-YAML--PP--Schema--Perl \
perl-YAML--PP--Schema--Tie--IxHash \
perl-YAML--PP--Schema--YAML1-1 \
perl-YAML--PP--Type--MergeKey \
perl-YAML--PP--Writer \
perl-YAML--PP--Writer--File \
perl-YAML-PP"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Module--Load"

inherit rpm
