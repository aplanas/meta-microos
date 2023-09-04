SUMMARY = "Computes interest for a given account"
DESCRIPTION = "Hledger-interest is a small command-line utility based on Simon Michael's \
hleder library. Its purpose is to compute interest for a given ledger account. \
Using command line flags, the program can be configured to use various schemes \
for day-counting, such as act/act, 30/360, 30E/360, and 30/360isda. \
Furthermore, it supports a (small) number of interest schemes, i.e. \
annual interest with a fixed rate and the scheme mandated by the German BGB288 \
(Basiszins fuer Verbrauchergeschaefte). Extending support for other schemes is \
fairly easy, but currently requires changes to the source code. \
 \
As an example, consider the following loan, stored in a file called \
'test.ledger': \
 \
> 2008/09/26 Loan > Assets:Bank EUR 10000.00 > Liabilities:Bank > > 2008/11/27 \
Payment > Assets:Bank EUR -3771.12 > Liabilities:Bank > > 2009/05/03 Payment > \
Assets:Bank EUR -1200.00 > Liabilities:Bank > > 2010/12/10 Payment > \
Assets:Bank EUR -3700.00 > Liabilities:Bank \
 \
Suppose that loan earns 5% interest per year, and payments amortize interest \
before amortizing the principal claim, then the resulting ledger would look \
like this: \
 \
> $ hledger-interest --file=test.ledger --source=Expenses:Interest \
--target=Liabilities:Bank --30-360 --annual=0.05 Liabilities:Bank > 2008/09/26 \
Loan > Assets:Bank EUR 10000.00 > Liabilities:Bank > > 2008/11/27 Payment > \
Assets:Bank EUR -3771.12 > Liabilities:Bank > > 2008/11/27 5.00% interest for \
EUR -10000.00 over 61 days > Liabilities:Bank EUR -84.72 > Expenses:Interest > \
> 2008/12/31 5.00% interest for EUR -6313.60 over 34 days > Liabilities:Bank \
EUR -29.81 > Expenses:Interest > > 2009/05/03 Payment > Assets:Bank EUR \
-1200.00 > Liabilities:Bank > > 2009/05/03 5.00% interest for EUR -6343.42 over \
123 days > Liabilities:Bank EUR -108.37 > Expenses:Interest > > 2009/12/31 \
5.00% interest for EUR -5251.78 over 238 days > Liabilities:Bank EUR -173.60 > \
Expenses:Interest > > 2010/12/10 Payment > Assets:Bank EUR -3700.00 > \
Liabilities:Bank > > 2010/12/10 5.00% interest for EUR -5425.38 over 340 days > \
Liabilities:Bank EUR -256.20 > Expenses:Interest > > 2010/12/31 5.00% interest \
for EUR -1981.58 over 21 days > Liabilities:Bank EUR -5.78 > Expenses:Interest \
 \
Running the utility with '--help' gives a brief overview over the available \
options: \
 \
> Usage: hledger-interest [OPTION...] ACCOUNT > -h --help print this message \
and exit > -V --version show version number and exit > -v --verbose echo input \
ledger to stdout (default) > -q --quiet don't echo input ledger to stdout > \
--today compute interest up until today > -f FILE --file=FILE input ledger file \
(pass '-' for stdin) > -s ACCOUNT --source=ACCOUNT interest source account > -t \
ACCOUNT --target=ACCOUNT interest target account > -I --ignore-assertions \
ignore any failing balance assertions > --act use 'act' day counting convention \
> --30-360 use '30/360' day counting convention > --30E-360 use '30E/360' day \
counting convention > --30E-360isda use '30E/360isda' day counting convention > \
--constant=RATE constant interest rate > --annual-schedule=SCHEDULE schedule of \
annual interest rates. > syntax: '[(Date1,Rate1),(Date2,Rate2),...]' > \
--annual=RATE annual interest rate > --bgb288 compute interest according to \
German BGB288."
LICENSE = "BSD-3-Clause"

PV = "1.6.5"

RPM_NAME = "hledger-interest-1.6.5-3.4.aarch64.rpm"
RPM_HASH = "140f4010ae63cf4d704edfe2dbfd72712e6065c14c87fe22314da4664d3ae71b142169cedb478e5f89ca7e9179292cfee8d11077420228036d83735e71937045"

RPROVIDES:${PN} += "hledger-interest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
