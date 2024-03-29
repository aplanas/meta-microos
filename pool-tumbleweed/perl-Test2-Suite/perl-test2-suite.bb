SUMMARY = "Distribution with a rich set of tools built upon the Test2 framework"
DESCRIPTION = "Rich set of tools, plugins, bundles, etc built upon the Test2 testing \
library. If you are interested in writing tests, this is the distribution \
for you."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.000155"

RPM_NAME = "perl-Test2-Suite-0.000155-1.3.noarch.rpm"
RPM_HASH = "9f6087c92ed687ccb08eaa88a386fb7046fefc1a5b7d1825492464d85fc845bd55e81bbbb6d6eb0b02d745f583805b1969357370b23a4bdb24be5efe82b8d97e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test2--AsyncSubtest \
perl-Test2--AsyncSubtest--Event--Attach \
perl-Test2--AsyncSubtest--Event--Detach \
perl-Test2--AsyncSubtest--Formatter \
perl-Test2--AsyncSubtest--Hub \
perl-Test2--Bundle \
perl-Test2--Bundle--Extended \
perl-Test2--Bundle--More \
perl-Test2--Bundle--Simple \
perl-Test2--Compare \
perl-Test2--Compare--Array \
perl-Test2--Compare--Bag \
perl-Test2--Compare--Base \
perl-Test2--Compare--Bool \
perl-Test2--Compare--Custom \
perl-Test2--Compare--DeepRef \
perl-Test2--Compare--Delta \
perl-Test2--Compare--Event \
perl-Test2--Compare--EventMeta \
perl-Test2--Compare--Float \
perl-Test2--Compare--Hash \
perl-Test2--Compare--Isa \
perl-Test2--Compare--Meta \
perl-Test2--Compare--Negatable \
perl-Test2--Compare--Number \
perl-Test2--Compare--Object \
perl-Test2--Compare--OrderedSubset \
perl-Test2--Compare--Pattern \
perl-Test2--Compare--Ref \
perl-Test2--Compare--Regex \
perl-Test2--Compare--Scalar \
perl-Test2--Compare--Set \
perl-Test2--Compare--String \
perl-Test2--Compare--Undef \
perl-Test2--Compare--Wildcard \
perl-Test2--Manual \
perl-Test2--Manual--Anatomy \
perl-Test2--Manual--Anatomy--API \
perl-Test2--Manual--Anatomy--Context \
perl-Test2--Manual--Anatomy--EndToEnd \
perl-Test2--Manual--Anatomy--Event \
perl-Test2--Manual--Anatomy--Hubs \
perl-Test2--Manual--Anatomy--IPC \
perl-Test2--Manual--Anatomy--Utilities \
perl-Test2--Manual--Concurrency \
perl-Test2--Manual--Contributing \
perl-Test2--Manual--Testing \
perl-Test2--Manual--Testing--Introduction \
perl-Test2--Manual--Testing--Migrating \
perl-Test2--Manual--Testing--Planning \
perl-Test2--Manual--Testing--Todo \
perl-Test2--Manual--Tooling \
perl-Test2--Manual--Tooling--FirstTool \
perl-Test2--Manual--Tooling--Formatter \
perl-Test2--Manual--Tooling--Nesting \
perl-Test2--Manual--Tooling--Plugin--TestExit \
perl-Test2--Manual--Tooling--Plugin--TestingDone \
perl-Test2--Manual--Tooling--Plugin--ToolCompletes \
perl-Test2--Manual--Tooling--Plugin--ToolStarts \
perl-Test2--Manual--Tooling--Subtest \
perl-Test2--Manual--Tooling--TestBuilder \
perl-Test2--Manual--Tooling--Testing \
perl-Test2--Mock \
perl-Test2--Plugin \
perl-Test2--Plugin--BailOnFail \
perl-Test2--Plugin--DieOnFail \
perl-Test2--Plugin--ExitSummary \
perl-Test2--Plugin--SRand \
perl-Test2--Plugin--Times \
perl-Test2--Plugin--UTF8 \
perl-Test2--Require \
perl-Test2--Require--AuthorTesting \
perl-Test2--Require--EnvVar \
perl-Test2--Require--Fork \
perl-Test2--Require--Module \
perl-Test2--Require--Perl \
perl-Test2--Require--RealFork \
perl-Test2--Require--Threads \
perl-Test2--Suite \
perl-Test2--Todo \
perl-Test2--Tools \
perl-Test2--Tools--AsyncSubtest \
perl-Test2--Tools--Basic \
perl-Test2--Tools--Class \
perl-Test2--Tools--ClassicCompare \
perl-Test2--Tools--Compare \
perl-Test2--Tools--Defer \
perl-Test2--Tools--Encoding \
perl-Test2--Tools--Event \
perl-Test2--Tools--Exception \
perl-Test2--Tools--Exports \
perl-Test2--Tools--GenTemp \
perl-Test2--Tools--Grab \
perl-Test2--Tools--Mock \
perl-Test2--Tools--Ref \
perl-Test2--Tools--Refcount \
perl-Test2--Tools--Spec \
perl-Test2--Tools--Subtest \
perl-Test2--Tools--Target \
perl-Test2--Tools--Tester \
perl-Test2--Tools--Warnings \
perl-Test2--Util--Grabber \
perl-Test2--Util--Guard \
perl-Test2--Util--Importer \
perl-Test2--Util--Ref \
perl-Test2--Util--Stash \
perl-Test2--Util--Sub \
perl-Test2--Util--Table \
perl-Test2--Util--Table--Cell \
perl-Test2--Util--Table--LineBreak \
perl-Test2--Util--Term \
perl-Test2--Util--Times \
perl-Test2--V0 \
perl-Test2--Workflow \
perl-Test2--Workflow--BlockBase \
perl-Test2--Workflow--Build \
perl-Test2--Workflow--Runner \
perl-Test2--Workflow--Task \
perl-Test2--Workflow--Task--Action \
perl-Test2--Workflow--Task--Group \
perl-Test2-Suite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Term--Table \
perl-Test2--API"

inherit rpm
