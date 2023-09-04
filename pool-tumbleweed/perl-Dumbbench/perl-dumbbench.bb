SUMMARY = "More reliable benchmarking with the least amount of thinking"
DESCRIPTION = "This module attempts to implement reasonably robust benchmarking with \
little extra effort and expertise required from the user. That is to say, \
benchmarking using this module is likely an improvement over \
 \
  time some-command --to --benchmark \
 \
or \
 \
  use Benchmark qw/timethis/; \
  timethis(1000, 'system('some-command', ...)'); \
 \
The module currently works similar to the former command line, except (in \
layman terms) it will run the command many times, estimate the uncertainty \
of the result and keep iterating until a certain user-defined precision has \
been reached. Then, it calculates the resulting uncertainty and goes \
through some pain to discard bad runs and subtract overhead from the \
timings. The reported timing includes an uncertainty, so that multiple \
benchmarks can more easily be compared. \
 \
Please note that 'Dumbbench' works entirely with wallclock time as reported \
by 'Time::HiRes'' 'time()' function."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.503"

RPM_NAME = "perl-Dumbbench-0.503-1.8.noarch.rpm"
RPM_HASH = "23712fe15e7ec486b273084690595c37db6747315c0bef36101b13f8845b61a65788eec383a1d0cb4cb37a0dfe5d4829912309798d528233e55ceb158af9fc18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Benchmark--Dumb \
perl-Dumbbench \
perl-Dumbbench--BoxPlot \
perl-Dumbbench--CPUFrequencyPinner \
perl-Dumbbench--Instance \
perl-Dumbbench--Instance--Cmd \
perl-Dumbbench--Instance--PerlEval \
perl-Dumbbench--Instance--PerlSub \
perl-Dumbbench--Result \
perl-Dumbbench--Stats"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Capture--Tiny \
perl-Class--XSAccessor \
perl-Devel--CheckOS \
perl-Number--WithError \
perl-Params--Util \
perl-Statistics--CaseResampling \
perl-parent"

inherit rpm
