SUMMARY = "Get stock and mutual fund quotes from various exchanges"
DESCRIPTION = "This module gets stock quotes from various internet sources all over the \
world. Quotes are obtained by constructing a quoter object and using the \
fetch method to gather data, which is returned as a two-dimensional hash \
(or a reference to such a hash, if called in a scalar context). For \
example: \
 \
    $q = Finance::Quote->new; \
    %info = $q->fetch('australia', 'CML'); \
    print 'The price of CML is '.$info{'CML', 'price'}; \
 \
The first part of the hash (eg, 'CML') is referred to as the stock. The \
second part (in this case, 'price') is referred to as the label."
LICENSE = "GPL-2.0-or-later"

PV = "1.54"

RPM_NAME = "perl-Finance-Quote-1.54-1.1.noarch.rpm"
RPM_HASH = "0109fd603b15d9aa618c6719833ebaa4691c97c67bbd2aa58b3671912869b0b2988e23f504ca1d442086ba1c2d234dcf795f4a5baf0dd31b66366997f3ad8727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Finance::Quote) \
perl(Finance::Quote::AEX) \
perl(Finance::Quote::ASEGR) \
perl(Finance::Quote::ASX) \
perl(Finance::Quote::AlphaVantage) \
perl(Finance::Quote::BSEIndia) \
perl(Finance::Quote::Bloomberg) \
perl(Finance::Quote::Bourso) \
perl(Finance::Quote::CSE) \
perl(Finance::Quote::Cdnfundlibrary) \
perl(Finance::Quote::Comdirect) \
perl(Finance::Quote::Currencies) \
perl(Finance::Quote::CurrencyRates::AlphaVantage) \
perl(Finance::Quote::CurrencyRates::ECB) \
perl(Finance::Quote::CurrencyRates::Fixer) \
perl(Finance::Quote::CurrencyRates::OpenExchange) \
perl(Finance::Quote::DWS) \
perl(Finance::Quote::Deka) \
perl(Finance::Quote::FTfunds) \
perl(Finance::Quote::Fidelity) \
perl(Finance::Quote::Finanzpartner) \
perl(Finance::Quote::Fondsweb) \
perl(Finance::Quote::Fool) \
perl(Finance::Quote::Fundata) \
perl(Finance::Quote::GoldMoney) \
perl(Finance::Quote::HU) \
perl(Finance::Quote::IEXCloud) \
perl(Finance::Quote::IndiaMutual) \
perl(Finance::Quote::MStaruk) \
perl(Finance::Quote::MorningstarAU) \
perl(Finance::Quote::MorningstarCH) \
perl(Finance::Quote::MorningstarJP) \
perl(Finance::Quote::NSEIndia) \
perl(Finance::Quote::NZX) \
perl(Finance::Quote::OnVista) \
perl(Finance::Quote::Oslobors) \
perl(Finance::Quote::SEB) \
perl(Finance::Quote::SIX) \
perl(Finance::Quote::Sinvestor) \
perl(Finance::Quote::TMX) \
perl(Finance::Quote::TSP) \
perl(Finance::Quote::TesouroDireto) \
perl(Finance::Quote::Tiaacref) \
perl(Finance::Quote::Tradegate) \
perl(Finance::Quote::Tradeville) \
perl(Finance::Quote::TreasuryDirect) \
perl(Finance::Quote::Troweprice) \
perl(Finance::Quote::Union) \
perl(Finance::Quote::UserAgent) \
perl(Finance::Quote::XETRA) \
perl(Finance::Quote::YahooJSON) \
perl(Finance::Quote::ZA) \
perl-Finance-Quote"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DateTime) \
perl(DateTime::Format::Strptime) \
perl(HTML::Entities) \
perl(HTML::TableExtract) \
perl(HTML::TokeParser) \
perl(HTML::TokeParser::Simple) \
perl(HTML::TreeBuilder) \
perl(HTML::TreeBuilder::XPath) \
perl(HTTP::Cookies) \
perl(HTTP::Headers) \
perl(HTTP::Request) \
perl(HTTP::Request::Common) \
perl(HTTP::Status) \
perl(IO::Uncompress::Unzip) \
perl(JSON) \
perl(LWP::Protocol::https) \
perl(LWP::Simple) \
perl(LWP::UserAgent) \
perl(Module::Load) \
perl(Mozilla::CA) \
perl(Readonly) \
perl(Spreadsheet::XLSX) \
perl(String::Util) \
perl(Text::Template) \
perl(Time::Piece) \
perl(Time::Seconds) \
perl(Try::Tiny) \
perl(Web::Scraper) \
perl(XML::LibXML)"

inherit rpm
