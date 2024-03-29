SUMMARY = "Mock Datetime->Now Calls During Tests"
DESCRIPTION = "Getting the current time sometimes is not very helpful for testing \
scenarios. Instead, if you could obtain a known value during the runtime of \
a testcase will make your results predictable. \
 \
Why another Date Mocker? I wanted something simple with a very concise \
usage pattern and a mocked date should only exist and stay constant inside \
a scope. After leaving the scope the current time should be back. This lead \
to this tiny module. \
 \
This simple module allows faking a given date and time for the runtime of a \
subsequent code block. By default the 'on' keyword is exported into the \
namespace of the test file. The date to get mocked must be in a format that \
is recognized by DateTime::Format::DateParse. \
 \
    on '2013-01-02 03:04:05', sub { ... }; \
 \
is basically the same as \
 \
    { \
        my $now = DateTime::Format::DateParse->parse_datetime( \
            '2013-01-02 03:04:05' \
        ); \
 \
        local *DateTime::now = sub { $now->clone }; \
 \
        ... everything from code block above \
    } \
 \
A drawback when relying on this module is that you must know that the \
module you are testing uses 'DateTime->now' to obtain the current time. \
=cut"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-Test-MockDateTime-0.02-1.14.noarch.rpm"
RPM_HASH = "c886df574bec24fa950498967e323ace754090423d382c83995d13107a5202b8537ddd02791711148ecf1cd803731ce81882b71415c3699f4aac4d5e509084d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockDateTime \
perl-Test-MockDateTime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime \
perl-DateTime--Format--DateParse \
perl-base \
perl-ok"

inherit rpm
